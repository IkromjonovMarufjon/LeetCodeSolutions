package uz.xsoft.february;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class Context_6002 {
    public static void main(String[] args) {
        BitSet set = new BitSet();

    }

    class Bitset {
        private int size;
        private Set<Integer> one;
        private Set<Integer> zero;

        public Bitset(int size) {
            this.size = size;
            one = new HashSet<>();
            zero = new HashSet<>(size);
            for (int i = 0; i < size; i++) {
                zero.add(i);
            }
        }

        public void fix(int idx) {
            if (zero.contains(idx)) {
                zero.remove(idx);
                one.add(idx);
            }
        }

        public void unfix(int idx) {
            if (one.contains(idx)) {
                one.remove(idx);
                zero.add(idx);
            }
        }

        public void flip() {
            Set<Integer> x = one;
            one = zero;
            zero = x;
        }

        public boolean all() {
            return zero.isEmpty();
        }

        public boolean one() {
            return !one.isEmpty();
        }

        public int count() {
            return one.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size);
            for (int i = 0; i <size; i++) {
                if (one.contains(i)) sb.append('1');
                else sb.append('0');
            }
            return sb.toString();
        }
    }
}
