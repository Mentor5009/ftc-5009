package org.firstinspires.ftc.teamcode;

/*public class Godzilla_State_Farm {
    private State state;
    public Godzilla_State_Farm(){
        state = State.Godzilla;
    }

    public  void Eatbooty(){
        state = state.compareTo();
    }

    enum State{
        Godzilla,
        Jetjaguar,
        Mechagodzilla,

    }
    /*
    static class MyBean {


        if(/*State){

        void toState1()
        }else;

        if(target = "STATE2")
        void toState2() {
        }else;

public class ThreadStateMachine
{
    private static Logger LOGGER = Logger.getLogger(ThreadStateMachine.class.getName());

    public static enum State
    {
        NEW
                {
                    @Override public State next(Transition transition)
                    {
                        return (transition == CREATE) ? RUNNING : ILLEGAL;
                    }
                },
        RUNNING
                {
                    @Override public State next(Transition transition)
                    {
                        if (transition == WAIT)
                        {
                            return BLOCKED;
                        }
                        else if (transition == FINISH)
                        {
                            return DEAD;
                        }
                        else
                        {
                            return ILLEGAL;
                        }
                    }
                },
        BLOCKED
                {
                    @Override public State next(Transition transition)
                    {
                        return (transition == RESUME) ? RUNNING : ILLEGAL;
                    }
                },
        DEAD
                {
                    @Override public State next(Transition transition)
                    {
                        return ILLEGAL;
                    }
                },
        ILLEGAL
                {
                    @Override public State next(Transition transition)
                    {
                        return ILLEGAL;
                    }
                };

        public State next(Transition transition)
        {
            return null;
        }
    }

    public static enum Transition
    {
        CREATE,
        WAIT,
        RESUME,
        FINISH
    }

    public static void main(String[] args)
    {
        State finish = run(State.NEW, CREATE, WAIT, RESUME, WAIT, RESUME, FINISH);
    }

    public static State run(State start, Transition... transitions)
    {
        State state = start;

        LOGGER.log(Level.INFO, "start state: {0}", start);
        for (Transition transition : transitions)
        {
            state = state.next(transition);
            LOGGER.log(Level.INFO, "current state: {0}", state);
        }

        LOGGER.info("finished");

        return state;
    }
}
*/
