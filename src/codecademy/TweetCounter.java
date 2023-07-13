package codecademy;

public class TweetCounter {

    public static boolean isValidTweet(String draft){
        if(draft.length() <= 280){
            System.out.println("Your message is " + draft.length() + " symbols long which fits the limit.");
            return true;
        } else {
            System.out.println("Your message is " + draft.length() + " symbols long which exceeds the limit.");
            return false;
        }
    }

    public static void main(String[] args) {

        String tweet = "Liz Lemon, ninjas are kind of cool... I just dont know any personally. Get on that.";

        // What's the character count?
        System.out.println(tweet.length());

        isValidTweet(tweet);

        String longissimo = "Twitter allows users to post tweets with a character limit. They capture the message the user enters as a String, count the length of the message, and use its length to decide whether or not to let the user post the message. The limit is 280 characters.\n" +
                "\n" +
                "Let’s check if tweet follows Twitter’s policy. Print out the number of characters in tweet using the length() method.";
        System.out.println(longissimo.length());

        isValidTweet(longissimo);

    }

}

