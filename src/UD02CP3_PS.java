void main() throws InterruptedException {
    SharedVar sharedVar = new SharedVar();
    CustomThreadSET customThreadSET = new CustomThreadSET(sharedVar);
    CustomThreadGET customThreadGET = new CustomThreadGET(sharedVar);

    Thread threadSet = new Thread(customThreadSET);
    Thread threadGet = new Thread(customThreadGET);

    threadSet.start();
    threadGet.start();

    threadSet.join();
    threadGet.join();
}