package com.company;

public class AnyTypeStorage<E> {
    private Object[] array;
    private int n;

    public AnyTypeStorage(int n) {
        if (n < 0){
            n = 0;
        }
        this.n = n;
        array = new Object[n];
        for (int i = 0; i < n; i++){
            array[i] = null;
        }
    }
    public E get(int index){
        if (index < 0 || index >= n){
            return null;
        }
        return (E) array[index];
    }
    public boolean set(E element, int index){
        if (index < 0 || index >= n){
            return false;
        } else {
            array[index] = element;
            return true;
        }
    }
    public static void test(){
        AnyTypeStorage<Long> longStorage = new AnyTypeStorage<>(5);
        System.out.println("Массив целых");
        for (int i = 0; i < 5; i++){
            longStorage.set((long)(Math.random() * 200 - 100), i);
        }
        for (int i = 0; i < 5; i++){
            System.out.println(longStorage.get(i));
        }

        AnyTypeStorage<Character> charStorage = new AnyTypeStorage<>(5);
        System.out.println("\nМассив символов");
        for (int i = 0; i < 5; i++){
            charStorage.set((char)(Math.random() * 200 + 100), i);
        }
        for (int i = 0; i < 5; i++){
            System.out.println(charStorage.get(i));
        }
    }
}
