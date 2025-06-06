package ui;

import dominio.AlunoController;
import dominio.Aluno;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class JFrameJanelaConsulta extends JFrame {

    private JTable tabela;
    private AlunoController controller;

    // Campos para edição do aluno selecionado
    private JTextField txtMatricula;
    private JTextField txtNome;
    private JTextField txtCurso;
    private JTextField txtIdade;

    // Botões para ações
    private JButton btnAtualizar;
    private JButton btnExcluir;

    public JFrameJanelaConsulta(AlunoController controller) {
        this.controller = controller;

        setTitle("Consulta de Alunos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Tabela
        tabela = new JTable();
        add(new JScrollPane(tabela), BorderLayout.CENTER);

        // Painel inferior com campos e botões
        JPanel painelInferior = new JPanel();
        painelInferior.setLayout(new GridLayout(2, 1));

        // Painel para os campos
        JPanel painelCampos = new JPanel(new FlowLayout());
        painelCampos.add(new JLabel("Matrícula:"));
        txtMatricula = new JTextField(8);
        txtMatricula.setEditable(false); // matrícula geralmente não muda
        painelCampos.add(txtMatricula);

        painelCampos.add(new JLabel("Nome:"));
        txtNome = new JTextField(12);
        painelCampos.add(txtNome);

        painelCampos.add(new JLabel("Curso:"));
        txtCurso = new JTextField(12);
        painelCampos.add(txtCurso);

        painelCampos.add(new JLabel("Idade:"));
        txtIdade = new JTextField(3);
        painelCampos.add(txtIdade);

        painelInferior.add(painelCampos);

        // Painel para os botões
        JPanel painelBotoes = new JPanel(new FlowLayout());
        btnAtualizar = new JButton("Atualizar");
        btnExcluir = new JButton("Excluir");

        painelBotoes.add(btnAtualizar);
        painelBotoes.add(btnExcluir);
        painelInferior.add(painelBotoes);

        add(painelInferior, BorderLayout.SOUTH);

        carregarTabela();

        // Evento para carregar os dados do aluno selecionado nos campos
        tabela.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int linha = tabela.getSelectedRow();
                if (linha >= 0) {
                    txtMatricula.setText(tabela.getValueAt(linha, 0).toString());
                    txtNome.setText(tabela.getValueAt(linha, 1).toString());
                    txtCurso.setText(tabela.getValueAt(linha, 2).toString());
                    txtIdade.setText(tabela.getValueAt(linha, 3).toString());
                }
            }
        });

        // Evento do botão Atualizar
        btnAtualizar.addActionListener(e -> {
            try {
                String matricula = txtMatricula.getText();
                String nome = txtNome.getText();
                String curso = txtCurso.getText();
                int idade = Integer.parseInt(txtIdade.getText());

                Aluno alunoAtualizado = new Aluno(matricula, nome, curso, idade);
                controller.atualizarAluno(alunoAtualizado);

                JOptionPane.showMessageDialog(this, "Aluno atualizado com sucesso!");
                carregarTabela();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Idade inválida!");
            }
        });

        // Evento do botão Excluir
        btnExcluir.addActionListener(e -> {
            String matricula = txtMatricula.getText();
            if (matricula.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Selecione um aluno para excluir!");
                return;
            }

            int confirm = JOptionPane.showConfirmDialog(this,
                    "Confirma exclusão do aluno com matrícula " + matricula + "?",
                    "Confirmação", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                Aluno alunoExcluir = new Aluno();
                alunoExcluir.setMatricula(matricula);

                controller.excluirAluno(alunoExcluir);

                JOptionPane.showMessageDialog(this, "Aluno excluído com sucesso!");
                carregarTabela();

                // Limpa os campos
                txtMatricula.setText("");
                txtNome.setText("");
                txtCurso.setText("");
                txtIdade.setText("");
            }
        });

        setVisible(true);
    }

    private void carregarTabela() {
        List<Aluno> alunos = controller.listarAlunos();
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Matrícula");
        model.addColumn("Nome");
        model.addColumn("Curso");
        model.addColumn("Idade");

        for (Aluno a : alunos) {
            model.addRow(new Object[]{
                    a.getMatricula(), a.getNome(), a.getCurso(), a.getIdade()
            });
        }

        tabela.setModel(model);
    }
}
