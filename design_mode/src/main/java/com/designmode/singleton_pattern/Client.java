package com.designmode.singleton_pattern;

/**
 * Created by Administrator on 2018/5/21.
 */

public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            //System.out.println("DCLSingleton  hashCode : " + DCLSingleton.getDclSingleton().hashCode());
                        }
                    }
            ).start();
        }
        for (int i = 0; i < 10; i++) {
            new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            System.out.println("Singleton1  hashCode : " + Singleton1.getSingleton1().hashCode());
                        }
                    }
            ).start();
        }

    }

}
