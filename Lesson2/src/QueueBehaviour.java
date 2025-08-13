public interface QueueBehaviour {
    void takeInqueue(Actor actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();

}
