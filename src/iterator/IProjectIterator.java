package iterator;

import java.util.Iterator;

/**
 * 如果要实现一个容器或者其它API提供接口时，提供这么养的一个接口，可以保证自己的实现类只用实现自己写的接口
 * 好处：可以减少与JDK的耦合性，程序的阅读相对也会清晰一些
 * 
 * @author zx
 * @date 2016年2月15日
 */
public interface IProjectIterator extends Iterator<Object> {

}
