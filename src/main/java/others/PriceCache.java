package others;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class PriceCache {
    private final Map<String, Double> prices = new HashMap<>();

    private final ReentrantReadWriteLock lock =
            new ReentrantReadWriteLock();

    public Double getPrice(String productId) {
        lock.readLock().lock();
        try {
            return prices.get(productId);
        } finally {
            lock.readLock().unlock();
        }
    }

    public void updatePrice(String productId, double price) {
        lock.writeLock().lock();
        try {
            prices.put(productId, price);
        } finally {
            lock.writeLock().unlock();
        }
    }
}