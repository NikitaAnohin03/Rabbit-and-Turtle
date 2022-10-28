package com.company;

public class AnimalThread extends Thread {
    String PersonName;
    int priorityThread;
    final int distance = 11;

    public AnimalThread(String PersonName, int priorityThread) {
        this.PersonName = PersonName;
        this.priorityThread = priorityThread;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priorityThread);
        Thread.currentThread().setName(PersonName);
        int timeToStep = 1000 / (Thread.currentThread().getPriority());
        for (int i = 0; i < distance; i++){
            try {
                Thread.sleep(timeToStep);
                System.out.println(getName() + (" - ")+(i*100) + " м ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == distance / 2) {

                if (Thread.currentThread().getPriority() == 1) {
                    Thread.currentThread().setPriority(10);
                } else {
                    Thread.currentThread().setPriority(1);
                }
                timeToStep = 1000 / (Thread.currentThread().getPriority());
            }
            if (i == distance - 10 ) {
            }

        }
        System.out.println("Finish");
        System.out.println("Winner: turtle");
    }
}
