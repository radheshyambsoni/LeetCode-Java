package PriorityQueue.Medium;

import java.util.PriorityQueue;

// 1845. Seat Reservation Manager
// https://leetcode.com/problems/seat-reservation-manager/
// Runtime 31 ms Beats 80.33%
// Memory 91.46 MB Beats 19.88%
// Nov 06, 2023

class SeatManager {
    int last;
    PriorityQueue<Integer> pq;

    public SeatManager(int n) {
        last = 0;
        this.pq = new PriorityQueue<>();
    }

    public int reserve() {
        if (pq.isEmpty()) {
            return ++last;
        }
        return pq.poll();
    }

    public void unreserve(int seatNumber) {
        if (seatNumber == last) {
            --last;
        } else {
            pq.offer(seatNumber);
        }
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */