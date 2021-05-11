package one.digitalinnovation.collections

class Repositorio<T> {                      // T aqui é um objeto genérico
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T) {
        map[id] = value              // Poderia ser assim: "map.put(id, value)" -- put associa o value especificado com a key especificada(id)
    }

    fun remove(id: String) = map.remove(id)

    fun findById(id: String) = map[id]          // Retornando o valor que está na chave -- Adicionando

    fun findAll() = map.values
}