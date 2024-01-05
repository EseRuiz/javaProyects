class SpaceAge {
    double seconds ;
    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return this.seconds ;
    }

    double onEarth() {
        return this.seconds/ 31557600.0;
    }

    double onMercury() {
        double mercuryOrbitalPeriod = 0.2408467 * 31557600.0;
        return (double) this.seconds / mercuryOrbitalPeriod;
    }

    double onVenus() {
        double venusOrbitalPeriod = 0.61519726 * 31557600.0;
        return (double) this.seconds / venusOrbitalPeriod;
    }

    double onMars() {
        double marsOrbitalPeriod = 1.8808158 * 31557600.0;
        return (double) this.seconds / marsOrbitalPeriod;
    }

    double onJupiter() {
        double jupOrbitalPeriod = 11.862615 * 31557600.0;
        return (double) this.seconds / jupOrbitalPeriod;
    }

    double onSaturn() {
        double saturOrbitalPeriod = 29.447498 * 31557600.0;
        return (double) this.seconds / saturOrbitalPeriod;
    }

    double onUranus() {
        double urOrbitalPeriod = 84.016846 * 31557600.0;
        return (double) this.seconds / urOrbitalPeriod;
    }

    double onNeptune() {
        double nepOrbitalPeriod = 164.79132 * 31557600.0;
        return (double) this.seconds / nepOrbitalPeriod;
    }

}