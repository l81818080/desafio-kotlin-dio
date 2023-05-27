import classes.Conteudo
import classes.Formacao
import classes.Nivel
import classes.Usuario

fun main() {

    val u000001 = Usuario("Lucas", 1)
    val u000002 = Usuario("Rita", 2)
    val u000003 = Usuario("Maria", 3)
    val u000004 = Usuario("Gabriel", 4)
    val u000005 = Usuario("Patrick", 5)

    val disci001 = Conteudo("POO - Programacao Orientada a Objetos",60, Nivel.BASICO)
    val disci002 = Conteudo("Descomplicando Redes",60, Nivel.BASICO)
    val disci003 = Conteudo("Docker", 140, Nivel.INTERMEDIARIO)
    val disci004 = Conteudo("Java", 240, Nivel.INTERMEDIARIO)
    val disci005 = Conteudo("Kotlin", 240, Nivel.AVANCADO)
    val disci006 = Conteudo("HTML/CSS/JavaScript", 400, Nivel.BASICO)
    val disci007 = Conteudo("React", 60, Nivel.INTERMEDIARIO)
    val mentoria1 = Conteudo("Mentoria Bootcamp TQI", 60, Nivel.BASICO)
    val mentoria2 = Conteudo("Bootcamp Front-End", 120, Nivel.BASICO)

    val bootcampJavaKotlin = Formacao("Bootcamp Java Kotlin TQI", listOf(disci001,
            disci002, disci003, disci004, disci005, mentoria1))

    val bootcampFrontEnd = Formacao("Bootcamp de Front-End", listOf(disci006, disci007,
            disci001, mentoria2))

    bootcampJavaKotlin.matricular(u000001)
    bootcampJavaKotlin.matricular(u000002)
    bootcampJavaKotlin.matricular(u000003)
    bootcampFrontEnd.matricular(u000001)
    bootcampFrontEnd.matricular(u000004)
    bootcampFrontEnd.matricular(u000005)


    println("***************************\n" +
            "***************************")

    println("Bootcamp Java Kotlin TQI")
    for (conteudo in bootcampJavaKotlin.conteudo){
        println("Conteudo: ${conteudo.nome}  Duração:  ${conteudo.duracao} horas  Nivel: ${conteudo.nivel}")
    }

    println( "Estudantes")
    for (usuario in bootcampJavaKotlin.getUsuariosInscritos()){
        println("Nome: ${usuario.nome}")
    }

    println("***************************\n" +
            "***************************")

    println("Bootcamp de Front-End")
    for (conteudo in bootcampFrontEnd.conteudo){
        println("Conteudo: ${conteudo.nome}  Duração:  ${conteudo.duracao} horas  Nivel: ${conteudo.nivel}")
    }

    println( "Inscrições")
    for (usuario in bootcampFrontEnd.getUsuariosInscritos()){
        println("Nome: ${usuario.nome}")
    }
}
