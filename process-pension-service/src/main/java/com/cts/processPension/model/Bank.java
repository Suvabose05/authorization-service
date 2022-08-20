package com.cts.processPension.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Model class for bank details
 
 *@author SUBHABRATA
 */
@Getter
@AllArgsConstructor
public class Bank {
	private String bankName;
	private long accountNumber;
	private String bankType;
}