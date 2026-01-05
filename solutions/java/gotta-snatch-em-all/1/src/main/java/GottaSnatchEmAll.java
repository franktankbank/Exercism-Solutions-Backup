import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<String>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.isEmpty() || theirCollection.isEmpty()) {
            return false;
        }
        if (myCollection.containsAll(theirCollection)) {
            return false;
        }
        Set<String> thisCollection = new HashSet<String>(myCollection);
        thisCollection.removeAll(theirCollection);
        return !thisCollection.isEmpty();
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> thisCollection = new HashSet<String>(collections.get(0));
        for (int i = 1; i < collections.size(); i++) {
            thisCollection.retainAll(collections.get(i));
        }
        return thisCollection;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> thisCollection = new HashSet<String>(collections.get(0));
        for (int i = 1; i < collections.size(); i++) {
            thisCollection.addAll(collections.get(i));
        }
        return thisCollection;
    }
}
