package com.interview.designpattern;

interface Telecom {
    void internetPlans();
    void voicePlans();
}


class Jio implements Telecom {
    @Override
    public void internetPlans() {
        System.out.println("Jio Internet Plan: ₹399 for 1.5GB/day");
    }

    @Override
    public void voicePlans() {
        System.out.println("Jio Voice Plan: Unlimited calls for ₹149");
    }
}

class Airtel implements Telecom {
    @Override
    public void internetPlans() {
        System.out.println("Airtel Internet Plan: ₹499 for 2GB/day");
    }

    @Override
    public void voicePlans() {
        System.out.println("Airtel Voice Plan: Unlimited calls for ₹199");
    }
}
class Vodafone implements Telecom {
	@Override
	public void internetPlans() {
		System.out.println("Vodafone Internet Plan: ₹299 for 1GB/day");
	}

	@Override
	public void voicePlans() {
		System.out.println("Vodafone Voice Plan: Unlimited calls for ₹99");
	}
}

class TelecomFactory {
    public static Telecom getTelecom(String provider) {
        if (provider.equalsIgnoreCase("jio")) {
            return new Jio();
        } else if (provider.equalsIgnoreCase("airtel")) {
            return new Airtel();
        } else if (provider.equalsIgnoreCase("vodafone")) {
			return new Vodafone();
		}
        return null;
    }
}


public class FactoryDesignePattern_1 {

	public static void main(String[] args) {
		Telecom jio = TelecomFactory.getTelecom("jio");
        jio.internetPlans();
        jio.voicePlans();

        Telecom airtel = TelecomFactory.getTelecom("airtel");
        airtel.internetPlans();
        airtel.voicePlans();
        
        Telecom vodafone = TelecomFactory.getTelecom("vodafone");
        vodafone.internetPlans();
        vodafone.voicePlans();

	}

}
