package easy;

class LicenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {
        S = S.replaceAll("-","");
        S = S.toUpperCase();
        if(S.length() < K){
            return S;
        }

        int section = 0;
        for(int i = S.length() - 1; i >=0; i--){

            section++;
            if(section == K && i != 0){
                S = S.substring(0,i) + "-" + S.substring(i,S.length());
                section = 0;
            }
        }
        return S;
    }
}