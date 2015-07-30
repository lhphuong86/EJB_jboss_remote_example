/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.walle;

/**
 *
 * @author walle86
 */
public interface RemoteCounter {
    void increment();
    void decrement();
    int getCount();
}
