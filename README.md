# Oracle Academy

Repositório de estudos e exercícios desenvolvidos durante o curso **Fundamentos de Java**, da Oracle Academy em parceria com a Gerando Falcões.

O projeto registra a evolução dos exemplos apresentados no curso: desde variáveis e estruturas de controle até pequenos programas orientados a objetos.

## Conteúdos

- Variáveis e tipos de dados
- Operadores e estruturas condicionais
- Laços de repetição
- Métodos, classes e membros estáticos
- Entrada de dados com `Scanner`
- Leitura de arquivos e tratamento de exceções
- Exercícios práticos de calculadora, tabuada, despesas e IMC
- Projetos de exemplo, como Musicfy, banco e cadastro de funcionários

## Estrutura do projeto

```text
oracle-academy/
├── src/
│   └── main/
│       ├── java/                  # Código-fonte organizado por pacote e assunto
│       │   ├── br/com/oraclegf/   # Exemplos introdutórios do curso
│       │   ├── calculadora/       # Exercícios de operações matemáticas
│       │   ├── desafio/           # Desafios e exercícios por nível
│       │   ├── despesas/          # Exercícios de controle de despesas
│       │   ├── empresa/           # Exemplos de orientação a objetos
│       │   ├── gf/musicfy/        # Projeto didático Musicfy
│       │   └── ...                # Outros assuntos do curso
│       └── resources/             # Arquivos de dados utilizados nos exemplos
├── pom.xml                        # Configuração de compilação com Maven
├── LICENSE
└── README.md
```

Cada classe executável possui seu próprio método `main`. Assim, os exercícios continuam independentes e podem ser estudados em qualquer ordem.

## Pré-requisitos

- JDK 17 ou superior
- Apache Maven 3.9 ou superior
- Git

Confirme a instalação com:

```bash
java -version
mvn -version
```

## Como executar

Clone o repositório usando SSH:

```bash
git clone git@github.com:agathalafaiety/oracle-academy.git
cd oracle-academy
```

Compile todos os exercícios:

```bash
mvn clean compile
```

Depois, execute a classe desejada pelo nome completo do pacote. Exemplo:

```bash
java -cp target/classes desafio.OlaMundo
```

Outros exemplos:

```bash
java -cp target/classes tabuada.TabuadaSimples
java -cp target/classes imc.CalcularIMCMain
java -cp target/classes gf.musicfy.MusicfyStarter
```

Algumas classes solicitam informações no terminal ou abrem caixas de diálogo durante a execução.

## Gerar o pacote

Para compilar o projeto e gerar o arquivo JAR em `target/`:

```bash
mvn clean package
```

## Convenções para novos exercícios

1. Salve classes Java em `src/main/java`.
2. Crie uma pasta por assunto e use o mesmo nome na declaração `package`.
3. Salve arquivos de entrada em `src/main/resources`.
4. Execute `mvn clean package` antes de enviar alterações.
5. Não versione arquivos gerados por IDEs ou pela compilação.

##
- Desenvolvido por [Agatha Lafaiety](https://github.com/agathalafaiety).
