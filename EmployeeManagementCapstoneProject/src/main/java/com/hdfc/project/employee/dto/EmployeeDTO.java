package com.hdfc.project.employee.dto;

import java.security.Security;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeDTO {

	private long employeeId;
	private String employeeName;
	private String dateOfBirth;

	
	private static final String AES_ALGORITHM="AES";
	private static final String AES_CIPHER_TRANSFORMATION = "AES/ECB/PKCS7Padding";
	private static final byte[] SECRET_KEY= "mycapstonekeypassword90346272023".getBytes();
	
	static {
		Security.addProvider(new BouncyCastleProvider());
	}
	public void setDateOfBirth(String dateOfBirth) throws Exception {
		Cipher cipher=Cipher.getInstance(AES_CIPHER_TRANSFORMATION, "BC");
		SecretKeySpec key =new SecretKeySpec(SECRET_KEY, AES_ALGORITHM);
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] encrypted =cipher.doFinal(dateOfBirth.getBytes());
		this.dateOfBirth = Base64.getEncoder().encodeToString(encrypted);
	}
}
