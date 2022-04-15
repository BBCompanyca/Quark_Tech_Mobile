package clases;

import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

public class EncryptPassword {
    
    public String ecnode(String secretKey, String Password) {
        
        String Encrypt = "";
        
        try {
            
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] llavePassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] BytesKey = Arrays.copyOf(llavePassword, 24);
            SecretKey key = new SecretKeySpec(BytesKey, "DESede");
            Cipher cifrado = Cipher.getInstance("DESede");
            cifrado.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainTextBytes = Password.getBytes("utf-8");
            byte[] buf = cifrado.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            Encrypt = new String(base64Bytes);
            
        } catch (Exception e) {
            
             System.err.println("¡Error al encriptar las contraseña! " + e);
            
        }
        
        return Encrypt;
    }

    public String deecnode(String secretKey, String Password) {
        
        String Decrypt = "";
        
        try {
            
            byte[] message = Base64.decodeBase64(Password.getBytes("utf-8"));
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);
            byte[] plainText = decipher.doFinal(message);
            Decrypt = new String(plainText, "UTF-8");

        } catch (Exception e) {
            
            System.err.println("¡Error al desencriptar las contraseña! " + e);
            
        }
        
        return Decrypt;
        
    }
    
}
