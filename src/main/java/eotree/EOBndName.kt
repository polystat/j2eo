package eotree

class EOBndName(var name: String) : EONode() {
    override fun generateEO(indent: Int): String {
        return name
    }
}