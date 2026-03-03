package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        if (boundary > amount) {
            return (boundary - amount) % boundary;
        } else return (amount - boundary) % boundary;
    }
}