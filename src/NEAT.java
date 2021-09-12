
public class NEAT {

    public static int fitness_criterion;
    public static int fitness_threshold   = 100;
    public static int pop_size  = 100;
    public static boolean reset_on_extinction = false;

   // activation_default      = tanh;
    public static double activation_mutate_rate  = 0.0;
 //   activation_options      = tanh

    //aggregation_default     = sum;
    public static double aggregation_mutate_rate = 0.0;
    //aggregation_options     = sum


   public static double bias_init_mean          = 0.0;
   public static double bias_init_stdev         = 1.0;
   public static double bias_max_value          = 30.0;
   public static double bias_min_value          = -30.0;
   public static double bias_mutate_power       = 0.5;
   public static double bias_mutate_rate        = 0.7;
   public static double bias_replace_rate       = 0.1;

   public static double compatibility_disjoint_coefficient = 1.0;
   public static double compatibility_weight_coefficient   = 0.5;


  public static double  conn_add_prob           = 0.5;
  public static double conn_delete_prob        = 0.5;

  public static boolean enabled_default  = true;
  public static double enabled_mutate_rate = 0.01;
  public static boolean feed_forward            = true ;
  //public static boolean initial_connection      = full
  public static double node_add_prob           = 0.2;
  public static double node_delete_prob        = 0.2;
  public static double num_hidden    = 0;
  public static double num_inputs    = 3;
  public static double  num_outputs     = 1;

  public static double response_init_mean      = 1.0;
  public static double  response_init_stdev     = 0.0;
  public static double response_max_value      = 30.0;
  public static double response_min_value      = -30.0;
  public static double response_mutate_power   = 0.0;
  public static double response_mutate_rate    = 0.0;
  public static double response_replace_rate   = 0.0;

  public static double weight_init_mean        = 0.0;
  public static double weight_init_stdev       = 1.0;
  public static double weight_max_value        = 30;
  public static double weight_min_value        = -30;
  public static double weight_mutate_power     = 0.5;
  public static double weight_mutate_rate      = 0.8;
  public static double weight_replace_rate     = 0.1;
  public static double compatibility_threshold = 3.0;

  //species_fitness_func = max;
  public static int max_stagnation       = 20;
  public static int species_elitism     = 2;

  public static int elitism            = 2;
  public static double survival_threshold = 0.2;


    static int scorenum = 0;


    public static void score(Pipes pipes) {
        if (pipes.x == 200) {
            scorenum += 1;
            System.out.println(scorenum);
        }

    }


}
