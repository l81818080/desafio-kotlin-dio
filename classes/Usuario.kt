package classes

class Usuario (_nome: String, _id: Int, _xp: Double = 500.00) {
    var nome: String = _nome
    val id: Int = _id
    var xp: Double = _xp
}