package repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import modelOptional.*;

import modelOptional.MotoristaOptional;

public class MotoristasOptional {
    private Map<String, Optional<MotoristaOptional>> motoristasOptional = new HashMap<>();

    public MotoristasOptional() {
        SeguroOptional seguroOptional = new SeguroOptional("Cobertura Total ", new BigDecimal("1000€"));
        CaminhaoOptional caminhaoOptional = new CaminhaoOptional("Volvo 2021", Optional.ofNullable(seguroOptional));
        Optional<MotoristaOptional> mOptional = Optional.of(new MotoristaOptional("Tony", 47, Optional.ofNullable(caminhaoOptional)));
       Optional<MotoristaOptional> mOptional2 = Optional.of(new MotoristaOptional("Juan", 14, null));
        
       motoristasOptional.put("Tony", mOptional);
       motoristasOptional.put("juan", mOptional2);
       
    }

}// end class
