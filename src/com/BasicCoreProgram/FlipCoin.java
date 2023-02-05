package com.BasicCoreProgram;

public class FlipCoin{
            public static void main(String[] args){
                int head=0, tail=0;
                for (int i=1; i<=10; i++)
                {
                    double rand=Math.random();
                    String coin="";
                    if(rand < 0.5)
                        head++;
                    else
                        tail++;
                }
                System.out.println("Head Probability:"+(head)/10.0);
                System.out.println("Tail Probability:"+(tail)/10.0);

            }

    }

