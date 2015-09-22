/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * Port mappings allow containers to access ports on the host container
 * instance to send or receive traffic. Port mappings are specified as
 * part of the container definition.
 * </p>
 */
public class PortMapping implements Serializable, Cloneable {

    /**
     * The port number on the container that is bound to the user-specified
     * or automatically assigned host port. If you specify a container port
     * and not a host port, your container will automatically receive a host
     * port in the ephemeral port range (for more information, see
     * <code>hostPort</code>).
     */
    private Integer containerPort;

    /**
     * The port number on the container instance to reserve for your
     * container. You can specify a non-reserved host port for your container
     * port mapping, or you can omit the <code>hostPort</code> (or set it to
     * <code>0</code>) while specifying a <code>containerPort</code> and your
     * container will automatically receive a port in the ephemeral port
     * range for your container instance operating system and Docker version.
     * <p>The default ephemeral port range is 49153 to 65535, and this range
     * is used for Docker versions prior to 1.6.0. For Docker version 1.6.0
     * and later, the Docker daemon tries to read the ephemeral port range
     * from <code>/proc/sys/net/ipv4/ip_local_port_range</code>; if this
     * kernel parameter is unavailable, the default ephemeral port range is
     * used. You should not attempt to specify a host port in the ephemeral
     * port range, since these are reserved for automatic assignment. In
     * general, ports below 32768 are outside of the ephemeral port range.
     * <p>The default reserved ports are 22 for SSH, the Docker ports 2375
     * and 2376, and the Amazon ECS Container Agent port 51678. Any host port
     * that was previously specified in a running task is also reserved while
     * the task is running (once a task stops, the host port is released).The
     * current reserved ports are displayed in the
     * <code>remainingResources</code> of <a>DescribeContainerInstances</a>
     * output, and a container instance may have up to 50 reserved ports at a
     * time, including the default reserved ports (automatically assigned
     * ports do not count toward this limit).
     */
    private Integer hostPort;

    /**
     * The protocol used for the port mapping. Valid values are
     * <code>tcp</code> and <code>udp</code>. The default is
     * <code>tcp</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     */
    private String protocol;

    /**
     * The port number on the container that is bound to the user-specified
     * or automatically assigned host port. If you specify a container port
     * and not a host port, your container will automatically receive a host
     * port in the ephemeral port range (for more information, see
     * <code>hostPort</code>).
     *
     * @return The port number on the container that is bound to the user-specified
     *         or automatically assigned host port. If you specify a container port
     *         and not a host port, your container will automatically receive a host
     *         port in the ephemeral port range (for more information, see
     *         <code>hostPort</code>).
     */
    public Integer getContainerPort() {
        return containerPort;
    }
    
    /**
     * The port number on the container that is bound to the user-specified
     * or automatically assigned host port. If you specify a container port
     * and not a host port, your container will automatically receive a host
     * port in the ephemeral port range (for more information, see
     * <code>hostPort</code>).
     *
     * @param containerPort The port number on the container that is bound to the user-specified
     *         or automatically assigned host port. If you specify a container port
     *         and not a host port, your container will automatically receive a host
     *         port in the ephemeral port range (for more information, see
     *         <code>hostPort</code>).
     */
    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }
    
    /**
     * The port number on the container that is bound to the user-specified
     * or automatically assigned host port. If you specify a container port
     * and not a host port, your container will automatically receive a host
     * port in the ephemeral port range (for more information, see
     * <code>hostPort</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerPort The port number on the container that is bound to the user-specified
     *         or automatically assigned host port. If you specify a container port
     *         and not a host port, your container will automatically receive a host
     *         port in the ephemeral port range (for more information, see
     *         <code>hostPort</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PortMapping withContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
        return this;
    }

    /**
     * The port number on the container instance to reserve for your
     * container. You can specify a non-reserved host port for your container
     * port mapping, or you can omit the <code>hostPort</code> (or set it to
     * <code>0</code>) while specifying a <code>containerPort</code> and your
     * container will automatically receive a port in the ephemeral port
     * range for your container instance operating system and Docker version.
     * <p>The default ephemeral port range is 49153 to 65535, and this range
     * is used for Docker versions prior to 1.6.0. For Docker version 1.6.0
     * and later, the Docker daemon tries to read the ephemeral port range
     * from <code>/proc/sys/net/ipv4/ip_local_port_range</code>; if this
     * kernel parameter is unavailable, the default ephemeral port range is
     * used. You should not attempt to specify a host port in the ephemeral
     * port range, since these are reserved for automatic assignment. In
     * general, ports below 32768 are outside of the ephemeral port range.
     * <p>The default reserved ports are 22 for SSH, the Docker ports 2375
     * and 2376, and the Amazon ECS Container Agent port 51678. Any host port
     * that was previously specified in a running task is also reserved while
     * the task is running (once a task stops, the host port is released).The
     * current reserved ports are displayed in the
     * <code>remainingResources</code> of <a>DescribeContainerInstances</a>
     * output, and a container instance may have up to 50 reserved ports at a
     * time, including the default reserved ports (automatically assigned
     * ports do not count toward this limit).
     *
     * @return The port number on the container instance to reserve for your
     *         container. You can specify a non-reserved host port for your container
     *         port mapping, or you can omit the <code>hostPort</code> (or set it to
     *         <code>0</code>) while specifying a <code>containerPort</code> and your
     *         container will automatically receive a port in the ephemeral port
     *         range for your container instance operating system and Docker version.
     *         <p>The default ephemeral port range is 49153 to 65535, and this range
     *         is used for Docker versions prior to 1.6.0. For Docker version 1.6.0
     *         and later, the Docker daemon tries to read the ephemeral port range
     *         from <code>/proc/sys/net/ipv4/ip_local_port_range</code>; if this
     *         kernel parameter is unavailable, the default ephemeral port range is
     *         used. You should not attempt to specify a host port in the ephemeral
     *         port range, since these are reserved for automatic assignment. In
     *         general, ports below 32768 are outside of the ephemeral port range.
     *         <p>The default reserved ports are 22 for SSH, the Docker ports 2375
     *         and 2376, and the Amazon ECS Container Agent port 51678. Any host port
     *         that was previously specified in a running task is also reserved while
     *         the task is running (once a task stops, the host port is released).The
     *         current reserved ports are displayed in the
     *         <code>remainingResources</code> of <a>DescribeContainerInstances</a>
     *         output, and a container instance may have up to 50 reserved ports at a
     *         time, including the default reserved ports (automatically assigned
     *         ports do not count toward this limit).
     */
    public Integer getHostPort() {
        return hostPort;
    }
    
    /**
     * The port number on the container instance to reserve for your
     * container. You can specify a non-reserved host port for your container
     * port mapping, or you can omit the <code>hostPort</code> (or set it to
     * <code>0</code>) while specifying a <code>containerPort</code> and your
     * container will automatically receive a port in the ephemeral port
     * range for your container instance operating system and Docker version.
     * <p>The default ephemeral port range is 49153 to 65535, and this range
     * is used for Docker versions prior to 1.6.0. For Docker version 1.6.0
     * and later, the Docker daemon tries to read the ephemeral port range
     * from <code>/proc/sys/net/ipv4/ip_local_port_range</code>; if this
     * kernel parameter is unavailable, the default ephemeral port range is
     * used. You should not attempt to specify a host port in the ephemeral
     * port range, since these are reserved for automatic assignment. In
     * general, ports below 32768 are outside of the ephemeral port range.
     * <p>The default reserved ports are 22 for SSH, the Docker ports 2375
     * and 2376, and the Amazon ECS Container Agent port 51678. Any host port
     * that was previously specified in a running task is also reserved while
     * the task is running (once a task stops, the host port is released).The
     * current reserved ports are displayed in the
     * <code>remainingResources</code> of <a>DescribeContainerInstances</a>
     * output, and a container instance may have up to 50 reserved ports at a
     * time, including the default reserved ports (automatically assigned
     * ports do not count toward this limit).
     *
     * @param hostPort The port number on the container instance to reserve for your
     *         container. You can specify a non-reserved host port for your container
     *         port mapping, or you can omit the <code>hostPort</code> (or set it to
     *         <code>0</code>) while specifying a <code>containerPort</code> and your
     *         container will automatically receive a port in the ephemeral port
     *         range for your container instance operating system and Docker version.
     *         <p>The default ephemeral port range is 49153 to 65535, and this range
     *         is used for Docker versions prior to 1.6.0. For Docker version 1.6.0
     *         and later, the Docker daemon tries to read the ephemeral port range
     *         from <code>/proc/sys/net/ipv4/ip_local_port_range</code>; if this
     *         kernel parameter is unavailable, the default ephemeral port range is
     *         used. You should not attempt to specify a host port in the ephemeral
     *         port range, since these are reserved for automatic assignment. In
     *         general, ports below 32768 are outside of the ephemeral port range.
     *         <p>The default reserved ports are 22 for SSH, the Docker ports 2375
     *         and 2376, and the Amazon ECS Container Agent port 51678. Any host port
     *         that was previously specified in a running task is also reserved while
     *         the task is running (once a task stops, the host port is released).The
     *         current reserved ports are displayed in the
     *         <code>remainingResources</code> of <a>DescribeContainerInstances</a>
     *         output, and a container instance may have up to 50 reserved ports at a
     *         time, including the default reserved ports (automatically assigned
     *         ports do not count toward this limit).
     */
    public void setHostPort(Integer hostPort) {
        this.hostPort = hostPort;
    }
    
    /**
     * The port number on the container instance to reserve for your
     * container. You can specify a non-reserved host port for your container
     * port mapping, or you can omit the <code>hostPort</code> (or set it to
     * <code>0</code>) while specifying a <code>containerPort</code> and your
     * container will automatically receive a port in the ephemeral port
     * range for your container instance operating system and Docker version.
     * <p>The default ephemeral port range is 49153 to 65535, and this range
     * is used for Docker versions prior to 1.6.0. For Docker version 1.6.0
     * and later, the Docker daemon tries to read the ephemeral port range
     * from <code>/proc/sys/net/ipv4/ip_local_port_range</code>; if this
     * kernel parameter is unavailable, the default ephemeral port range is
     * used. You should not attempt to specify a host port in the ephemeral
     * port range, since these are reserved for automatic assignment. In
     * general, ports below 32768 are outside of the ephemeral port range.
     * <p>The default reserved ports are 22 for SSH, the Docker ports 2375
     * and 2376, and the Amazon ECS Container Agent port 51678. Any host port
     * that was previously specified in a running task is also reserved while
     * the task is running (once a task stops, the host port is released).The
     * current reserved ports are displayed in the
     * <code>remainingResources</code> of <a>DescribeContainerInstances</a>
     * output, and a container instance may have up to 50 reserved ports at a
     * time, including the default reserved ports (automatically assigned
     * ports do not count toward this limit).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostPort The port number on the container instance to reserve for your
     *         container. You can specify a non-reserved host port for your container
     *         port mapping, or you can omit the <code>hostPort</code> (or set it to
     *         <code>0</code>) while specifying a <code>containerPort</code> and your
     *         container will automatically receive a port in the ephemeral port
     *         range for your container instance operating system and Docker version.
     *         <p>The default ephemeral port range is 49153 to 65535, and this range
     *         is used for Docker versions prior to 1.6.0. For Docker version 1.6.0
     *         and later, the Docker daemon tries to read the ephemeral port range
     *         from <code>/proc/sys/net/ipv4/ip_local_port_range</code>; if this
     *         kernel parameter is unavailable, the default ephemeral port range is
     *         used. You should not attempt to specify a host port in the ephemeral
     *         port range, since these are reserved for automatic assignment. In
     *         general, ports below 32768 are outside of the ephemeral port range.
     *         <p>The default reserved ports are 22 for SSH, the Docker ports 2375
     *         and 2376, and the Amazon ECS Container Agent port 51678. Any host port
     *         that was previously specified in a running task is also reserved while
     *         the task is running (once a task stops, the host port is released).The
     *         current reserved ports are displayed in the
     *         <code>remainingResources</code> of <a>DescribeContainerInstances</a>
     *         output, and a container instance may have up to 50 reserved ports at a
     *         time, including the default reserved ports (automatically assigned
     *         ports do not count toward this limit).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PortMapping withHostPort(Integer hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * The protocol used for the port mapping. Valid values are
     * <code>tcp</code> and <code>udp</code>. The default is
     * <code>tcp</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @return The protocol used for the port mapping. Valid values are
     *         <code>tcp</code> and <code>udp</code>. The default is
     *         <code>tcp</code>.
     *
     * @see TransportProtocol
     */
    public String getProtocol() {
        return protocol;
    }
    
    /**
     * The protocol used for the port mapping. Valid values are
     * <code>tcp</code> and <code>udp</code>. The default is
     * <code>tcp</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @param protocol The protocol used for the port mapping. Valid values are
     *         <code>tcp</code> and <code>udp</code>. The default is
     *         <code>tcp</code>.
     *
     * @see TransportProtocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
    
    /**
     * The protocol used for the port mapping. Valid values are
     * <code>tcp</code> and <code>udp</code>. The default is
     * <code>tcp</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @param protocol The protocol used for the port mapping. Valid values are
     *         <code>tcp</code> and <code>udp</code>. The default is
     *         <code>tcp</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see TransportProtocol
     */
    public PortMapping withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * The protocol used for the port mapping. Valid values are
     * <code>tcp</code> and <code>udp</code>. The default is
     * <code>tcp</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @param protocol The protocol used for the port mapping. Valid values are
     *         <code>tcp</code> and <code>udp</code>. The default is
     *         <code>tcp</code>.
     *
     * @see TransportProtocol
     */
    public void setProtocol(TransportProtocol protocol) {
        this.protocol = protocol.toString();
    }
    
    /**
     * The protocol used for the port mapping. Valid values are
     * <code>tcp</code> and <code>udp</code>. The default is
     * <code>tcp</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @param protocol The protocol used for the port mapping. Valid values are
     *         <code>tcp</code> and <code>udp</code>. The default is
     *         <code>tcp</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see TransportProtocol
     */
    public PortMapping withProtocol(TransportProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContainerPort() != null) sb.append("ContainerPort: " + getContainerPort() + ",");
        if (getHostPort() != null) sb.append("HostPort: " + getHostPort() + ",");
        if (getProtocol() != null) sb.append("Protocol: " + getProtocol() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getContainerPort() == null) ? 0 : getContainerPort().hashCode()); 
        hashCode = prime * hashCode + ((getHostPort() == null) ? 0 : getHostPort().hashCode()); 
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PortMapping == false) return false;
        PortMapping other = (PortMapping)obj;
        
        if (other.getContainerPort() == null ^ this.getContainerPort() == null) return false;
        if (other.getContainerPort() != null && other.getContainerPort().equals(this.getContainerPort()) == false) return false; 
        if (other.getHostPort() == null ^ this.getHostPort() == null) return false;
        if (other.getHostPort() != null && other.getHostPort().equals(this.getHostPort()) == false) return false; 
        if (other.getProtocol() == null ^ this.getProtocol() == null) return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false) return false; 
        return true;
    }
    
    @Override
    public PortMapping clone() {
        try {
            return (PortMapping) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    