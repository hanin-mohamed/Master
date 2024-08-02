package Structural.Proxy;
import java.util.*;
public class InternetProxy implements ISP{
    private List<String> blockedSites = Arrays.asList("Facbook","Instgram","Twitter");
    @Override
    public String serverSite(String url) {
        if (blockedSites.contains(url)) {
            return "Internet Server Error";
        }

        return new Etisalat().serverSite(url);
    }
}
