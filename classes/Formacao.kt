package classes

data class Formacao(val nome: String, var conteudo: List<Conteudo>) {
    val inscricao = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscricao.add(usuario)
    }

    fun getUsuariosInscritos():List<Usuario>{
        return inscricao
    }
}
