package Lab_07;

import java.util.Scanner;

public class L7Q3 extends MyQueue<Integer> {

    public void deductFirst(int e) {
        super.queue.set(0, super.peek() - e);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        L7Q3 shareQueue = new L7Q3();
        L7Q3 priceQueue = new L7Q3();

        int total = 0, numShares = 0, sellAmount = 0;

        do {

            System.out.print("Enter your query ([Buy / Sell] [shareAmount] [price]): ");
            String[] query = sc.nextLine().split(" ");

            if (query[0].equalsIgnoreCase("Buy")) {
                shareQueue.enqueue(Integer.parseInt(query[1]));
                priceQueue.enqueue(Integer.parseInt(query[2]));
            }
            else if (query[0].equalsIgnoreCase("Sell")) {

                System.out.println("Selling the shares now ...");
                
                numShares = Integer.parseInt(query[1]);
                sellAmount = Integer.parseInt(query[2]);

                while (numShares > 0) {

                    if (shareQueue.isEmpty() || priceQueue.isEmpty()) {
                        System.out.println("No shares to sell!");
                        break;
                    }
                    
                    if (shareQueue.peek() > numShares) {
                        
                        total += numShares * (sellAmount - priceQueue.peek());

                        shareQueue.deductFirst(numShares);
                        
                        numShares = 0;
                        
                        System.out.printf("Total Capital Gain / Loss: %s\n", total);
                    }
                    else {
                        
                        total += shareQueue.peek() * (sellAmount - priceQueue.dequeue());
                        numShares -= shareQueue.dequeue();
                    }
                }
            }

            System.out.printf("Queue for Share: %s\n", shareQueue.toString());
            System.out.printf("Queue for Price: %s\n", priceQueue.toString());
        }
        while (!(shareQueue.isEmpty() || priceQueue.isEmpty()));

        System.out.printf("Final Capital Gain / Loss: %s\n", total);

        sc.close();
    }
}
