package com.cts.disbursepension.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Model class for bank details
 * 
 *@author SUBHABRATA
 *
 */
@AllArgsConstructor
@Getter
public class BankDetails {
	private String bankName;
	private long accountNumber;
	private String bankType;
}
