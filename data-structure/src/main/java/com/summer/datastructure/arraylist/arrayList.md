## arraylist

#### 数据结构
    动态数组，最重要的是动态扩容
#### 特性 
    以数组实现。节约空间，但数组有容量限制。
    超出限制时会增加50%容量，用System.arraycopy()复制到新的数组，因此最好能给出数组大小的预估值。
    默认第一次插入元素时创建大小为10的数组。
    按数组下标访问元素—get(i)/set(i,e) 的性能很高，这是数组的基本优势。
    直接在数组末尾加入元素—add(e)的性能也高，但如果按下标插入、删除元素—add(i,e), remove(i), remove(e)，
    则要用System.arraycopy()来移动部分受影响的元素，性能就变差了，这是基本劣势。    
#### 代码实现
    private void ensureCapacityInternal(int minCapacity) {
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        ensureExplicitCapacity(minCapacity);
    }
    private void ensureExplicitCapacity(int minCapacity) {
        modCount++;
        // overflow-conscious code
        if (minCapacity - elementData.length > 0)
            grow(minCapacity);
    }
    
    // 扩容核心方法--也是arraylist最核心的方法
    private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        // 扩展为原来的1.5倍
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        // 如果扩为1.5倍还不满足需求，直接扩为需求值
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
        //将原来数组的值copy新数组中去， ArrayList的引用指向新数组
        //这儿会新创建数组，如果数据量很大，重复的创建的数组，那么还是会影响效率，
        //因此鼓励在合适的时候通过构造方法指定默认的capaticy大小
        elementData = Arrays.copyOf(elementData, newCapacity);
    }