package common.utils;

public abstract class LoadableComponents<T extends LoadableComponents<T>> {

    /**
     * Ensure that the component is currently loaded
     * @return The component
     * @throws Error when the component cannot be loaded
     */
    public LoadableComponents() {
    }

    public T get() {
        try {
            this.isLoaded();
            return (T) this;
        } catch (Error var2) {
            this.load();
        }
        this.isLoaded();{
        }
        return (T) this;
    }


    protected abstract void load();

    protected abstract void isLoaded() throws Error;
}
