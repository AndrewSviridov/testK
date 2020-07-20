class My() : MyMBean {

    var number = 0
    override fun getMyName(): String? {
        return "test"
    }

    override fun setSomeValue(value1: Int) {
        number = value1
    }

    override fun getSomeValue(): Int {
        return number
    }

    override fun writeToConsole(message: String?) {
        println(message)
    }

    override fun concat(str1: String?, str2: String?): String? {
        return str1 + str2
    }

}