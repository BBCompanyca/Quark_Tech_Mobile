package validatelicense;

public class License {
    
    private static License licenseinstance;

    private String license, dateExpiration, typeLicense;

    public String getTypeLicense() {
        return typeLicense;
    }

    public void setTypeLicense(String typeLicense) {
        this.typeLicense = typeLicense;
    }
    private int daysFromExpirate;

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public static License getLicenseinstance() {
        return licenseinstance;
    }

    public static void setLicenseinstance(License licenseinstance) {
        License.licenseinstance = licenseinstance;
    }

    public int getDaysFromExpirate() {
        return daysFromExpirate;
    }

    public void setDaysFromExpirate(int daysFromExpirate) {
        this.daysFromExpirate = daysFromExpirate;
    }
    
    public static License getInstance(){

        if (licenseinstance == null) {
            licenseinstance = new License();
        }
        return licenseinstance;
        
    }

}
