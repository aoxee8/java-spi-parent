# java-spi-parent
java spi机制

ServiceLoader默认到 META-INF/services/目录中查找

META-INF/services目录下的 文件名必须为 接口或抽象类的 
文件内容为 接口实现类的全路径，多个换行

接口或者抽象类，需要默认提供一个无参的构造函数 (用来实例化)

ServiceLoader在遍历的时候 才实例化

