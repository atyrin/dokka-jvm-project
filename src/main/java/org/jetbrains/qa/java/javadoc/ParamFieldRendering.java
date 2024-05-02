package org.jetbrains.qa.java.javadoc;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Check param rendering
 *
 * @param <Bar> a bar
 * @param <Baz> a baz
 */
public class ParamFieldRendering<Bar extends String, Baz extends String> implements java.util.Map<Bar, Baz> {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Baz get(Object key) {
        return null;
    }

    @Nullable
    @Override
    public Baz put(Bar key, Baz value) {
        return null;
    }

    @Override
    public Baz remove(Object key) {
        return null;
    }

    @Override
    public void putAll(@NotNull Map<? extends Bar, ? extends Baz> m) {

    }

    @Override
    public void clear() {

    }

    @NotNull
    @Override
    public Set<Bar> keySet() {
        return null;
    }

    @NotNull
    @Override
    public Collection<Baz> values() {
        return null;
    }

    @NotNull
    @Override
    public Set<Entry<Bar, Baz>> entrySet() {
        return null;
    }
}