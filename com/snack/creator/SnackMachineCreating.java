package com.snack.creator;

import com.snack.interfacing.SnackMachine;
import com.snack.SnackService;

public class SnackMachineCreating {
    public static SnackMachine getSnackMachine() {
        return new SnackService();
    }

}