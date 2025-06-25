classDiagram
    %% Pacote app
    class Main {
        -Alert alerta
        +finalizarPrograma(String, String)
        +mostraAlerta(String, String)
        +start(Stage)
        +main(String[])
    }

    %% Pacote dominio
    interface Conversante {
        +responder(String) String
        +prepare(Path[])
    }

    class Mensagem {
        -texto: String
        -autor: String
        -dataTime: LocalDateTime
        +getTexto(): String
        +getAutor(): String
        +getDataTime(): LocalDateTime
    }

    class MensagemTexto {
        +MensagemTexto(autor: String, texto: String, dataTime: LocalDateTime)
    }

    class MensagemUsuario {
        +MensagemUsuario(autor: String, texto: String)
    }

    class Conversa {
        -conversante: Conversante
        -mensagensAntigas: List~Mensagem~
        -novasMensagens: List~Mensagem~
        +enviaMensagem(m: Mensagem): Mensagem
        +setConversante(c: Conversante)
        +getUltimasMensagens(): List~Mensagem~
    }

    class HistoricoController {
        -banco: HistoricoDAO
        -novasMensagens: List~Mensagem~
        +getMensagensAntigas(): List~Mensagem~
        +addMensagem(m: Mensagem)
        +salvarNovasMensagens()
    }

    %% Pacote servicosTecnicos
    abstract class ConexaoAPIIA {
        -URL: URI
        -API_KEY: String
        -contexto: JSONArray
        -client: HttpClient
        +fazRequisicao(data: JSONObject): JSONObject
        +getContexto(): JSONArray
        +preparaContexto(textos: String[])
        +criaJSONContext(texto: String): JSONObject
    }

    class RespostaProntas {
        +responder(texto: String): String
        +prepare(arquivos: Path[])
        +getPerguntasProntas(): Vector~String~
    }

    class ChatGPT {
        +ChatGPT(chave: String)
        +responder(prompt: String): String
        +prepare(arquivos: Path[])
        +criaJSONContext(texto: String): JSONObject
    }

    class DeepSeek {
        +DeepSeek(chave: String)
        +responder(prompt: String): String
        +prepare(arquivos: Path[])
        +criaJSONContext(texto: String): JSONObject
    }

    abstract class ConexaoBD {
        +static banco: Connection
        +static initConnection(url: String, user: String, password: String)
        +static prepareInstrucao(stmt: String): PreparedStatement
        +static executeInstrucao(stmt: String)
        +static queryInstrucao(stmt: String): ResultSet
        +static fechaConexao()
    }

    class HistoricoDAO {
        -formatador: DateTimeFormatter
        +criarTabelaHistorico()
        +salvaMensagens(mensagens: List~Mensagem~)
        +deletarMensagem(data: LocalDateTime)
        +atualizarMensagem(data: LocalDateTime, texto: String)
        +carregarMensagens(): List~Mensagem~
    }

    class Env {
        -static envMap: Map~String,String~
        +static load(filePath: String)
        +static get(key: String): String
        +static get(key: String, defaultValue: String): String
    }

    %% Pacote ui
    class TelaPrincipal {
        -conversaui: ConversaUI
        +criarComponentes()
    }

    class ConversaUI {
        -contentBox: VBox
        -mensagens: ObservableList~MensagemUI~
        -conversa: Conversa
        -animacaoLoading: MensagemCarregando
        -containerAnimacao: HBox
        -esperandoMensagem: boolean
        +visualizarMensagens()
        +addMensagem(mensagem: MensagemUI, alinharDireita: boolean)
        +enviarMensagem(texto: String): boolean
        +limparConversa()
        +mudarConversante(valor: int)
    }

    class MensagemUI {
        -balao: Pane
        -textoLabel: Label
        -cor: Color
        -menu: MenuOpcoesMensagem
        -mensagem: Mensagem
        +setCor(cor: Color)
        +setTexto(texto: String)
        +getTexto(): String
    }

    class MensagemCarregando {
        -pontosContainer: HBox
        -animacao: Timeline
        +iniciarAnimacao()
        +pararAnimacao()
    }

    class MenuOpcoesMensagem {
        -referencia: Mensagem
        +configurarItens()
    }

    %% Heranças
    MensagemTexto <|-- Mensagem
    MensagemUsuario <|-- Mensagem

    ChatGPT <|-- ConexaoAPIIA
    DeepSeek <|-- ConexaoAPIIA

    RespostaProntas ..|> Conversante
    ChatGPT ..|> Conversante
    DeepSeek ..|> Conversante

    %% Relações
    Main --> TelaPrincipal
    TelaPrincipal --> ConversaUI
    ConversaUI --> Conversa
    ConversaUI --> MensagemUI
    ConversaUI --> MensagemCarregando
    ConversaUI --> ChatGPT
    ConversaUI --> DeepSeek
    ConversaUI --> RespostaProntas
    Conversa --> Conversante
    Conversa --> Mensagem
    HistoricoController --> HistoricoDAO
    HistoricoController --> Mensagem
    HistoricoDAO --> ConexaoBD
    HistoricoDAO --> Mensagem
    MensagemUI --> Mensagem
    MensagemUI --> MenuOpcoesMensagem
    MenuOpcoesMensagem --> Mensagem
    Env ..> Main
    Env ..> ConversaUI
    Env ..> ChatGPT
    Env ..> DeepSeek
