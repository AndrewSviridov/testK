interface MyMBean {

    fun getMyName(): String?

    fun setSomeValue(value1: Int)

    fun getSomeValue(): Int

    fun writeToConsole(message: String?)

    fun concat(str1: String?, str2: String?): String?
}
