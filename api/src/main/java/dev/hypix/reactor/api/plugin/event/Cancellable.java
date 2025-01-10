package dev.hypix.reactor.api.plugin.event;

public interface Cancellable {
    boolean isCancelled();
    void setCancelled(final boolean cancel);
}
