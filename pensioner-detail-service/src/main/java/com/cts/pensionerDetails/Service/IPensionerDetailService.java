package com.cts.pensionerDetails.Service;

import com.cts.pensionerDetails.Model.PensionerDetails;

/**@author SUBHABRATA
 * Interface providing implementations for PensionerDetailService
 * 
 */
public interface IPensionerDetailService {

	public PensionerDetails getPensionerDetailByAadhaarNumber(String aadhaarNumber);

}
