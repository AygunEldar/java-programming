package july;

import june.main;

import java.time.LocalTime;
import java.util.*;

public class ElonMusk {

    public static void main(String[] args) {
        String resume = "Elon Reeve Musk FRS (born June 28, 1971) is an entrepreneur and business magnate.\n" +
                "  He is the founder, CEO, and Chief Engineer at SpaceX; early stage investor,[note 2] CEO, and Product\n" +
                "   Architect of Tesla, Inc;. founder of The Boring Company; and co-founder of Neuralink and OpenAI.\n" +
                "    A centibillionaire, Musk is one of the richest people in the world.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Musk was born to a Canadian mother and South African father and raised in Pretoria,\n" +
                "                 South Africa. He briefly attended the University of Pretoria before moving to Canada\n" +
                "                  aged 17 to attend Queen's University. He transferred to the University of Pennsylvania\n" +
                "                  two years later, where he received bachelor's degrees in economics and physics.\n" +
                "                   He moved to California in 1995 to attend Stanford University but decided instead\n" +
                "                   to pursue a business career, co-founding the web software company Zip2 with brother Kimbal.\n" +
                "                    The startup was acquired by Compaq for $307 million in 1999. Musk co-founded online\n" +
                "                    bank X.com that same year, which merged with Confinity in 2000 to form PayPal.\n" +
                "                    The company was bought by eBay in 2002 for $1.5 billion.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"In 2002, Musk founded SpaceX, an aerospace manufacturer and space transport services company,\n" +
                "                 of which he is CEO and CTO. In 2004, he joined electric vehicle manufacturer Tesla Motors, Inc.\n" +
                "                 (now Tesla, Inc.) as chairman and product architect, becoming its CEO in 2008. In 2006,\n" +
                "                 he helped create SolarCity, a solar energy services company that was later acquired by Tesla\n" +
                "                 and became Tesla Energy. In 2015, he co-founded OpenAI, a nonprofit research company that promotes\n" +
                "                 friendly artificial intelligence. In 2016, he co-founded Neuralink, a neurotechnology company\n" +
                "                 focused on developing brain–computer interfaces, and founded The Boring Company, a tunnel\n" +
                "                  construction company. Musk has proposed the Hyperloop, a high-speed vactrain transportation system.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Musk has been the subject of criticism due to unorthodox or unscientific stances and highly\n" +
                "                 publicized controversies. In 2018, he was sued for defamation by a diver who advised in the\n" +
                "                  Tham Luang cave rescue; a California jury ruled in favor of Musk. In the same year,\n" +
                "                  he was sued by the US Securities and Exchange Commission (SEC) for falsely tweeting that he\n" +
                "                   had secured funding for a private takeover of Tesla. He settled with the SEC, temporarily\n" +
                "                   stepping down from his chairmanship and accepting limitations on his Twitter usage.\n" +
                "                   Musk has spread misinformation about the COVID-19 pandemic and has received criticism\n" +
                "                   from experts for his other views on such matters as artificial intelligence and public transport.";

        resume = resume.toLowerCase();

        System.out.println(frequencyWords(resume));
        System.out.print(frequencyWords2(resume));


    }

    // Version 1 cheap way
    public static Map<String, Integer> frequencyWords(String str) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<String> words = new ArrayList<>(Arrays.asList(str.split(" ")));
        for (String eachWord : words) {
            map.put(eachWord, Collections.frequency(words, eachWord));

        }
        return map;

    }
        public static Map<String, Integer> frequencyWords2 (String str){

            Map<String, Integer> map = new HashMap<>();

            List<String> words = new ArrayList<>(Arrays.asList(str.split(" ")));

            for (String eachWord : words) {

                if (!map.containsKey(eachWord)) {
                    map.put(eachWord, 1);

                } else {
                    map.put(eachWord, map.get(eachWord) + 1);

                }
            }
            return map;
        }
    }
