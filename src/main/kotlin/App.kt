//import org.jolokia.client.J4pClient
//import org.jolokia.client.request.J4pReadRequest
import javax.management.InstanceAlreadyExistsException
import javax.management.MBeanRegistrationException
import javax.management.MalformedObjectNameException
import javax.management.NotCompliantMBeanException


object App {
    @Throws(
        MalformedObjectNameException::class,
        InstanceAlreadyExistsException::class,
        MBeanRegistrationException::class,
        NotCompliantMBeanException::class,
        InterruptedException::class
    )
    @JvmStatic
    fun main(args: Array<String>) {
        val testclass = My()
        /*  val mbs = ManagementFactory.getPlatformMBeanServer()
          val name = ObjectName("kotlin.testBranch:type=My")
          val mbean = My()
          mbs.registerMBean(mbean, name)
  */
        /*    val  j4pClient = J4pClient("http://localhost:8080/jolokiaU");


            val  req = J4pReadRequest("com.kotlin:type=My");
            val atrb=req.attributes
            val resp = j4pClient.execute(req);
            val vals: Map<String, Long> = resp.getValue();

         */
        println("---------------")
        println("Waiting forever...")
        Thread.sleep(Long.MAX_VALUE)
    }
}