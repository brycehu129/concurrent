package com.bryce.special.column.concurrentModel.stm;

/**
 * @author bryce
 * @version 1.0.0
 * @Description MVCC 理论，数据的每一次修改都对应着一个唯一的版本号,所以类设计为不变性的
 */
public final class VersionedRef<T> {

    final T value;
    final long version;

    //构造方法
    public VersionedRef(T value, long version) {
        this.value = value;
        this.version = version;
    }

}
