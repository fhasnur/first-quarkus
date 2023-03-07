package id.kawahedukasi.endpoint.advance.injectionbeans.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StoreService {

    public String list() {
        return "Find Us at: \n-Bandung\n-Jakarta\n-Surabaya";
    }

    public String info(String city) {
        switch (city) {
            case "bandung":
                return "Find our Store at Bandung, Jl. Asia Afrika";
            case "jakarta":
                return "Find our Store at Jakarta, Jl. Kuningan";
            case "surabaya":
                return "Find our Store at Surabaya, Jl. Johar";
            default:
                return "unknown city";
        }
    }
}