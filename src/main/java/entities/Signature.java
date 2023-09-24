package entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Signature {

    private String signatureBinary;

    private String signatureIdentity;

    public String getSignatureBinary() {
        return signatureBinary;
    }

    public void setSignatureBinary(String signatureBinary) {
        this.signatureBinary = signatureBinary;
    }

    public String getSignatureIdentity() {
        return signatureIdentity;
    }

    public void setSignatureIdentity(String signatureIdentity) {
        this.signatureIdentity = signatureIdentity;
    }
}
