class SqueakyClean {
    static String clean(String identifier) {
        String finalIdentifier;
        String underscoredIdentifier = identifier.replace(' ', '_');
        if (underscoredIdentifier.contains("-")) {
            int secondHalfIndex = underscoredIdentifier.indexOf("-") + 1;
            char secondHalfChar = Character.toUpperCase(underscoredIdentifier.charAt(secondHalfIndex));
            StringBuilder camelCasedUnderscoredIdentifierString = new StringBuilder(underscoredIdentifier);
            camelCasedUnderscoredIdentifierString.setCharAt(secondHalfIndex, secondHalfChar);
            finalIdentifier = camelCasedUnderscoredIdentifierString.toString().replace("-", "");
        } else {
            finalIdentifier = underscoredIdentifier;
        }
        finalIdentifier = finalIdentifier.replace("4", "a").replace("3", "e").replace("0", "o").replace("1", "l").replace("7", "t").replaceAll("[^A-Za-z0-9_]","");
        return finalIdentifier;
        // throw new UnsupportedOperationException("Please implement the (static) SqueakyClean.clean() method");
    }
}
