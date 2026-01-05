class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    boolean isVulnerable() {
        return false;
    }
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
    @Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {
    private boolean spellPrepared = false;
    @Override
    boolean isVulnerable() {
        return !this.spellPrepared;
    }
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
    void prepareSpell() {
        this.spellPrepared = true;
    }
    @Override
    int getDamagePoints(Fighter fighter) {
        return this.spellPrepared ? 12 : 3;
    }
}