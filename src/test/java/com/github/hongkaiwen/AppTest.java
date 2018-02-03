package com.github.hongkaiwen;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void test() {
        // mock creation
        List mockedList = mock(List.class);

        // 模拟调用了 add 方法和clear方法
        mockedList.add("one");
        mockedList.clear();

        // 声明测试规则，add 方法被调用了两次，clear方法被调用了一次
        verify(mockedList, times(2)).add("one");
        verify(mockedList).clear();

        when(mockedList.get(1)).thenReturn("def");
        System.out.println(mockedList.get(1));
    }

}
